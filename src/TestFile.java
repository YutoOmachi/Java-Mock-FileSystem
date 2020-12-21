import commands.ChangeDirectory;
import commands.List;
import commands.MakeDirectory;
import commands.PrintWorkingDirectory;
import commands.Search;
import commands.Tree;
import exceptions.AlreadyExistsException;
import exceptions.InvalidArgumentException;
import exceptions.InvalidPathException;
import filesystem.Directory;
import filesystem.File;
import filesystem.FileSystem;

public class TestFile {
//  public static void main(String[] args) throws InvalidArgumentException {
//    Directory root = new Directory("Root", null);
//    Directory newDir = new Directory("newDir", root);
//    Directory newDir1 = new Directory("newDir1", root);
//    File newFile = new File("newFile", newDir);
//    FileSystem fileSystem = FileSystem.createFileSystemInstance(root);
//    Search search = new Search(fileSystem);
//
//    Tree tree = new Tree(fileSystem);
//    tree.runCommand(new String[] {"tree"});
//    search.runCommand(new String[]{"search", ".", "-type", "d", "-name",
//        "\"newDir\""});
//  }
}
