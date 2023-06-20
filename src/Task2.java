import java.util.List;

public class Task2 {
  //метод удаления из списка четных значений
  public static List<Integer> chet(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        list.remove(i);
      }
    }
    return list;
  }
}
