// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<Stream> {
    private List <Stream> Streams = new ArrayList<>();

    public void addGroup(Stream Group) {
        Streams.add(Group);
    }

    @Override
    public Iterator<Stream> iterator() {
        return Streams.iterator();
    }

    public List getGroups() {
     
        throw new UnsupportedOperationException("Unimplemented method 'getGroups'");
    }
}