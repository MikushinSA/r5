import react.Context
import react.createContext
import react.FC
import react.Props
import react.ReactNode
import react.useState

data class GradeColorScheme(
    val grade1Color: String,
    val grade2Color: String,
    val grade3Color: String,
    val grade4Color: String,
    val grade5Color: String
)

val GradeColorContext: Context<GradeColorScheme> = createContext(
    GradeColorScheme(
        grade1Color = "black",
        grade2Color = "brown",
        grade3Color = "green",
        grade4Color = "yellow",
        grade5Color = "red"
    )
)
// Провайдер, предоставляющий дочерним компонентам доступ к схеме раскраски
external interface GradeColorProviderProps : Props {
    var children: ReactNode
}


val GradeColorProvider = FC<GradeColorProviderProps> { props ->
    val (colorScheme, setColorScheme) = useState(
        GradeColorScheme(
            grade1Color = "black",
            grade2Color = "brown",
            grade3Color = "green",
            grade4Color = "yellow",
            grade5Color = "red"
        )
    )

    GradeColorContext.Provider {
        value = colorScheme
        +props.children
    }
}
