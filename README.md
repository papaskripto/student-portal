<img width="936" height="631" alt="student-portal-1" src="https://github.com/user-attachments/assets/458d2d03-72a4-47f3-b7c6-e147841bfe9f" />

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
