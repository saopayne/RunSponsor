package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Volunteer {

    Event event
    User user
    boolean active
    Date dateCreated
    Date lastUpdated

    static belongsTo = Event

    static constraints = {
        event nullable:false, blank:false
        user nullable:false, blank:false
    }

    static mapping = {
        sort dateCreated:"desc"
    }
}
