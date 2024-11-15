import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import emotion.react.css

external interface FilteredStudentListProps : Props {
    var filter: (Student) -> Boolean
    var title: String
}

val CFilteredStudentList = FC<FilteredStudentListProps> { props ->
    h1 { +props.title }

    GradeColorProvider {
        ol {
            studentList.filter(props.filter).map { student ->
                li {
                    CStudent {
                        this.student = student
                        setGrade = { newGrade ->
                            student.grade = newGrade
                        }
                    }
                }
            }
        }
    }
}
