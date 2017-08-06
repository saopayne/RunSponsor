package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Message {

    String subject
    String content
    Message parent
    Event event
    User author
    Date dateCreated
    Date lastUpdated

    static belongsTo = [event: Event]

    static constraints = {
        subject(blank: true)
        content(blank: true, maxSize: 1000)
        parent(nullable: true)
        author(nullable: false)
        dateCreated(nullable: true)
    }

    @Override
    String toString() {
        return "$content sent by: $author"
    }
}
