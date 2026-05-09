# StudentGradeManager
Organize student grades.

#### Features:
    - Add a student
    - Add student grades
    - Calculate the student average grade
    - Find top student
    - Find bottom student

#### Data Structure (How students are connected to grades)
Student -> list of grades
`HashMap<Student, ArrayList<Grade>>`
For example: `Geoffrey Ouma -> [Math:20, Chemistry: 33]`
