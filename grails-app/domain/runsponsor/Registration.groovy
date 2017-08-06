package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Registration {

    String firstName
    String lastName
    String email
    Event event

    static belongsTo = [event: Event]

    static constraints = {
        firstName nullable:false
        lastName nullable:false
        email nullable:false, email:true
    }

    @Override
    String toString(){
        "${firstName} ${lastName} - ${event}"
    }
}
