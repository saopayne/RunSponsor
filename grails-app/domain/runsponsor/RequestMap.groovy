package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class RequestMap {

    String url
    String configAttribute

    static constraints = {
        url(blank: false, unique: true)
        configAttribute(blank: false)
    }
}
