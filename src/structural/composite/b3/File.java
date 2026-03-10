package structural.composite.b3;

public class File implements Component{
    private String tenFile;
    private String ngayTao;

    public File(String tenFile, String ngayTao) {
        this.ngayTao = ngayTao;
        this.tenFile = tenFile;
    }

    @Override
    public String getStringTreeFolder() {
        return "\t" + this.tenFile;
    }

    @Override
    public String getPath() {
        return "";
    }
}
