package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private  List<StudentGroup> streams;
    
    /**
    * конструктор потоков студентов
    * @param streams
    */   
    public  StudentStream(List<StudentGroup> streams) {
        this.streams = streams;
    }
    public StudentStream(List<Student> listStud1, int i) {
    }
    /**
    * возвращаем значание 
    * @return
    */
    public List<StudentGroup> getStreams() {
	    return streams;
    }

    public void setSreams(List<StudentGroup> streams) {
	    this.streams = streams;
    }

	/**
	 * подключение анонимного итератора для перебора в цикле for группы студентов
	 *   
	 * */
    @Override
    public Iterator<StudentGroup> iterator() {
	    return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
		    public boolean hasNext() {
			return index < streams.size();
		    }
		    @Override
		    public StudentGroup next() {
			    if(!hasNext()) {
			        return null;
                }
                return streams.get(index++);
		    }     
        };
    }

}