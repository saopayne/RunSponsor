package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Ad {

    String name
    String imageLocation
    String imageName
    Date dateCreated
    Date lastUpdated

    static hasMany = [adClicks: AdClick, adViews: AdView]

    static constraints = {
        name(nullable: false, blank: false)
        imageLocation(nullable: false, blank: false)
        imageName(nullable: false, blank: false)
    }

    @Override
    String toString() {
        return "Ad with name: $name and imageLocation: $imageLocation"
    }
}
