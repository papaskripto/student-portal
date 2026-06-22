<img width="916" height="620" alt="student-portal-2" src="https://github.com/user-attachments/assets/0eca1de1-b09c-46fc-a3b6-d2e7c0163b8f" />

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
