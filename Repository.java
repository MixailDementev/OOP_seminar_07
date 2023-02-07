import java.util.ArrayList;
import java.util.List;

public class Repository<E> {

    List<E> repo = new ArrayList();

    public void addToRepo(List repo, E e) {
        repo.add(e);
    }

    public void delFromRepo(List repo, int index) {
        repo.remove(index);
    }

    public void showRepo(List repo) {
        for (int i = 0; i < repo.size(); i++) {
            System.out.println(repo.get(i));
        }
    }

    public void changeRepo(List repo, int index, E e) {
        repo.set(index, e);
    }
}
