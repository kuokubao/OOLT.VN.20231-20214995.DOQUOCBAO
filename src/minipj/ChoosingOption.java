package minipj;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        // Hiển thị hộp thoại với câu hỏi và hai lựa chọn "Yes" và "No"
        int option = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn kiếm thật nhiều tiền  không?");

        // Xử lý khi người dùng chọn "Yes", "No" hoặc "Cancel"
        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn: Có (Có vẻ bạn rất muốn tiền)");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn: Không (Bạn là người không đam mê tiền :)) )");
        } else if (option == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn thật vô tâm");
        }

        // Hiển thị hộp thoại với câu hỏi và hai lựa chọn "I do" và "I don't"
        Object[] options = {"I do", "I don't"};
        int option1 = JOptionPane.showOptionDialog(
                null,
                "Bây giờ có một cục tiền trước mặt bạn có nhặt làm của riêng không?",
                "Chọn lựa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0] // Mặc định chọn "I do"
        );

        // Xử lý khi người dùng chọn "I do" hoặc "I don't"
        if (option1 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn: I do (Hảo hán)");
        } else if (option1 == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã chọn: I don't (Why? Bạn nghĩ gì?)");
        } else if (option1 == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã  chọn Cancel");
        }
        JOptionPane.showMessageDialog(null, "Cảm ơn vì những lựa chọn vô tri");
        // Kết thúc chương trình
        System.exit(0);
    }
}
