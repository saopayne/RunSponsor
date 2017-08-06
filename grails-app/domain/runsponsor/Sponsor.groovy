package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Sponsor {

    String name
    String website
    String description
    String bannerLocation
    String bannerName
    String logoName
    String logoLocation
    String slug
    User rep


    static hasMany=[sponsorships:Sponsorship, tags:Tag]

    static searchable = {
        tags component: true
    }

    static constraints = {
        name(blank:false)
        website(blank:true, nullable:true)
        description(nullable:true, maxSize:5000)
        sponsorships(nullable:true)
        tags(nullable:true)
        rep(nullable:true)
        bannerLocation(nullable:true, blank:true)
        bannerName(nullable:true, blank:true)
        logoName(nullable:true, blank:true)
        logoLocation(nullable:true, blank:true)
        slug(nullable:true, blank:true)
    }

    @Override
    String toString(){
        name
    }

}
