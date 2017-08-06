package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class AdClick {

    String host
    Date dateClicked

    static belongsTo = [ad: Ad]

    static constraints = {
        host(nullable: true, blank: true)
        dateClicked(nullable: false, blank: false)
    }

    @Override
    String toString() {
        return "The ad: ${ad} was clicked on: $dateClicked by $host"
    }

}
