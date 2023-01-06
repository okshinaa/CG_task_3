package ru.vsu.cs.okshina_v_a;

import ru.vsu.cs.okshina_v_a.math.Vector3f;
import ru.vsu.cs.okshina_v_a.model.Model;
import ru.vsu.cs.okshina_v_a.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
//        Vector3f vector = new Vector3f();
//        vector.x = 1;
//        vector.y = 2;
//        vector.z = 3;

        String content = Files.readString(Path.of("WrapBody.obj"));

        Model A = ObjReader.read(content);

    }
}