package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class AdView {

    String host
    Date dateViewed

    static belongsTo = [ad: Ad]

    static constraints = {
        host(nullable: true, blank: true)
        dateViewed(nullable: false, blank: false)
    }

    @Override
    String toString() {
        return "The ad: ${ad} was viewed on: $dateViewed by $host"
    }

}
