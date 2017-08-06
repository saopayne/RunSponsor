package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Post {

    String title
    String content
    Event event
    Date dateCreated

    static belongsTo = [event: Event]

    static constraints = {
        title(blank: false)
        content(blank: false, maxSize: 1000)
        dateCreated(blank: false)
    }

}
