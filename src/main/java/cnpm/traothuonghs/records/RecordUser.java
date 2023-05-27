package cnpm.traothuonghs.records;

public record RecordUser(
        int id,
        AccessLevel accessLevel) {
    public enum AccessLevel {
        PhuHuynh,
        Khu,
        ThanhPho,
        Tinh,
        QuocGia
    }

}
