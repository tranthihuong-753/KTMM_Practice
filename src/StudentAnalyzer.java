import java.util.List;

public class StudentAnalyzer {
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        int number_sv = scores.size();
        if(number_sv == 0){
            return 0;
        }
        int count = 0;
        for(int i=0 ; i < number_sv ; i++){
            if(scores.get(i) < 0 || scores.get(i) > 10){
                continue;
            }
            if(scores.get(i) >= 8){
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        int number_sv = scores.size();
        if(number_sv == 0){
            return 0;
        }
        double count = 0;
        int number = 0;
        for(int i=0 ; i < number_sv ; i++){
            if(scores.get(i) < 0 || scores.get(i) > 10){
                continue;
            }
            count += scores.get(i);
            number ++;
        }
        count = count/number;
        return count;
    }
}