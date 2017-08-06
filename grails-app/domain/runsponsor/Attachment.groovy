package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Attachment {

    String name
    String displayName
    String location
    String description
    Date dateCreated
    Date lastUpdated
    Event event

    static belongsTo = [event: Event]

    static constraints = {
        name(nullable: false, blank: false)
        displayName(nullable: true, blank: true)
        location(nullable: false, blank: false)
        description(blank: true, maxSize: 1000)
    }

    @Override
    String toString() {
        return name
    }
}
