package Domain;

import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{idGroup=" + idGroup +
                ", numberOfStudents=" + group.size() +
                ", students=" + group +
                '}';
    }

    @Override
    public int compareTo(StudentGroup otherGroup) {
        // Сначала сравниваем по количеству студентов в группе
        int compareBySize = Integer.compare(this.group.size(), otherGroup.group.size());
        if (compareBySize != 0) {
            return compareBySize;
        }
        // Если количество студентов одинаково, сравниваем по идентификатору группы
        return Integer.compare(this.idGroup, otherGroup.idGroup);
    }

}
