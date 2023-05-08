package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * класс StudentGroup - организация обработки данных(Itrerable <Student),с подключением метода сортировки (implements Comparable)
 */
public class StudentGroup  implements Iterable<Student> , Comparable<StudentGroup> {
    private int stream;
    private List<Student> students;
    
    /**
     * конструктор группы студентов
     * @param students
     */
    public StudentGroup(List<Student> students, int stream) {
        this.students = students;
        this.stream = stream;
    }

    /**
     * устанавливаем номер потока
     * @param stream
     */
    public void setStream(int stream) {
        this.stream = stream;
    }

    /**
     * возврат номера потока
     * @return
     */
    public int getStream() {
        return stream;
    }


    /**
     * возврат списка студента
     * @return
     */
 public List<Student> getStudents() {
        return students;
    }
    /**
     *  изменение списка студентов
     * @param students
     */
        public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * анонимный итератор
     */
	@Override
	public Iterator<Student> iterator() {
		return new  Iterator<Student>() {
            private int  index = 0;
            @Override
            public boolean hasNext() {
               return index <students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                // counter++;
                return students.get(index++);        
            }
        };
	}

    @Override
    public int compareTo(StudentGroup o) {
        if(this.getStream() == o.getStream())
              {
                 return 0;
              }
              if (this.getStream() < o.getStream())
              {
                     return -1;
              }
              return 1;
       }

}

    
