package lap17;
public class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }
// kiểm tra dấu ngoặc của biểu thức có hợp lệ không
    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}


