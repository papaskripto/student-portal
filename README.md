<img width="1917" height="918" alt="student-portal" src="https://github.com/user-attachments/assets/92d11df0-ba11-4807-81a0-66c283c5f0bb" />
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
