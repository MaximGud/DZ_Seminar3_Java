import java.util.List;


public class Task3 {
  // метод определения мимнимльного значения в списке
  public static Integer minValue(List<Integer> list){ 
    int min = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i)<min){
        min = list.get(i);
      }
    }
    return min;
  }
// метод определения максимального значения в списке
  public static Integer maxValue(List<Integer> list){
    int max = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i)>max){
        max = list.get(i);
      }
    }
    return max;
  }
// метод определения среднего по позиции значения в списке
  public static Integer midValue(List<Integer> list){
    list.sort(null);
    int mid = list.get(list.size()/2);
    return mid;
  }
}
