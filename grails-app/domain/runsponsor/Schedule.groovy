package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Schedule {

    String content

    static belongsTo = [event: Event]

    static constraints = {
    }
}
