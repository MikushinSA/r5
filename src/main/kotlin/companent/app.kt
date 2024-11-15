import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.div
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.Link


val App = FC<Props>("App") {
    BrowserRouter {
        div {
            Link { to = "/students"; +"  Список всех студентов" }
            Link { to = "/students/excellent"; +"  Список отличников" }
            Link { to = "/students/underachievers"; +"  Список двоечников" }
        }

        Routes {
            Route { path = "/students"; element = CStudentList.create() }

            Route {
                path = "/students/excellent"
                element = CFilteredStudentList.create {
                    filter = { student -> student.grade >= 4 }
                    title = "Список отличников"
                }
            }

            Route {
                path = "/students/underachievers"
                element = CFilteredStudentList.create {
                    filter = { student -> student.grade == 2 }
                    title = "Список двоечников"
                }
            }
        }
    }
}
