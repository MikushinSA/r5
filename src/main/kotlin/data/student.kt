// Модель данных для студента с полями имени, фамилии и оценки
data class Student(
    val firstname: String,
    val surname: String,
    var grade: Int = 0 // Оценка по умолчанию
)

// Список студентов с фиксированными именами и фамилиями
val studentList = arrayListOf(
    Student("Sheldon", "Cooper"),
    Student("Leonard", "Hofstadter"),
    Student("Howard", "Wolowitz")
)
