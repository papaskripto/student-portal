<img width="1917" height="918" alt="student-portal" src="https://github.com/user-attachments/assets/92d11df0-ba11-4807-81a0-66c283c5f0bb" />

# Student Portal
Organize student grades.

### How It Works:
    - user (teacher/admin/parent) login
    - Add a student
    - Add student grades (teacher)
    - View a student's portal (grades) (for parents)
    - Calculate the student average grade (for teacher/admin)
    - Find top student (for teacher/admin)
    - Find bottom student (also for teacher/admin)

### Data Structure (How students are connected to grades)
Student -> list of grades
`HashMap<Student, ArrayList<Grade>>`
For example: `Geoffrey Ouma -> [Math:20, Chemistry: 33]`
