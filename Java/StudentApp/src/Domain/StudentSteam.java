package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> studentGroups;

    public StudentSteam(int streamNumber, List<StudentGroup> studentGroups) {
        this.streamNumber = streamNumber;
        this.studentGroups = studentGroups;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentStream{streamNumber=").append(streamNumber);
        sb.append(", numberOfGroups=").append(studentGroups.size());
        sb.append(", studentGroups=[");
        for (StudentGroup group : studentGroups) {
            sb.append("{groupId=").append(group.getIdGroup());
            sb.append(", numberOfStudents=").append(group.getGroup().size());
            sb.append(", students=").append(group.getGroup()).append("}, ");
        }
        sb.append("]}");
        return sb.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
