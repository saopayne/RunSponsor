package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class User {

    boolean enabled
    String username
    String passwd
    String email
    String avatarLocation
    String avatarName
    String fp
    Profile profile
    Date dateCreated
    String hiddenHelp = ""
    static final Integer HELP_1 = 1
    static final Integer HELP_2 = 2
    static final Integer HELP_3 = 3
    static final Integer HELP_4 = 4

    static transients = ['pass']
    static hasMany = [authorities: Role, volunteers:Volunteer]
    static belongsTo = Role
    static searchable = true

    def showHelp(helpVal){
        if (hiddenHelp && hiddenHelp.trim() != ''){
            def hiddenHelps = hiddenHelp.split(',').collect{it.toInteger()}
            println hiddenHelps
            return !hiddenHelps?.contains(helpVal)
        }
        else
            return true
    }

    def hideHelp(helpVal){
        if (hiddenHelp && hiddenHelp.trim() != '')
            hiddenHelp += ",$helpVal"
        else
            hiddenHelp += helpVal
    }

    String pass = '[secret]'

    @Override
    String toString() {
        return username
    }

    def isAdmin(){
        def adminRole = Role.findByAuthority("ROLE_ADMIN")
        if(adminRole?.users.find{it.id == id}){
            return true
        } else {
            return false
        }
    }

    def isOrganizer(Event event) {
        println "we're in the isOrganizer method of the TekUser. event is ${event}"
        event.organizer.id == id
    }

    def isVolunteer(Event event) {
        println "we're in the isVolunteer method of the TekUser. event is ${event}"
        event.volunteers.find{it.id == this.id}
    }

    static constraints = {
        username(blank: false, unique: true)
        passwd(blank: false, unique:true)
        email(email:true)
        avatarLocation(nullable:true, blank: true)
        avatarName(nullable:true, blank: true)
        fp(nullable: true, blank:true)
        profile(nullable:true)
        dateCreated(nullable:true, blank:true)
        hiddenHelp(nullable:true)
    }

    static mapping = {
        profile lazy:false
    }
}
