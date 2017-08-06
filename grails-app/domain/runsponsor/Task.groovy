package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Task {

    String title
    String notes
    User assignedTo
    Date dueDate
    Event event
    Boolean completed

    static constraints = {
        title(blank:false)
        notes(blank:true, nullable:true, maxSize:5000)
        assignedTo(nullable:true)
        dueDate(nullable:true)
        completed(nullable:true)
    }

    static belongsTo = Event

    @Override
    String toString(){
        return title
    }
}
