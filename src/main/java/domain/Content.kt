package domain

abstract class ContentState
class Available : ContentState()
class Unavailable : ContentState()

interface Content : Id {
    var description: String
    var poster: String
    var title: String
    var state: ContentState
    var relatedContent: MutableList<Content>
}
