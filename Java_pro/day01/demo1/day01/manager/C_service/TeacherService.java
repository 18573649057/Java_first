package demo1.day01.manager.C_service;

import demo1.day01.manager.D_dao.TeacherDao;
import demo1.day01.manager.E_domain.Teacher;

import java.util.ArrayList;

// 业务员   处理具体的业务逻辑
public class TeacherService {
    // 叫人过来。  创建对象
    TeacherDao td = new TeacherDao();

    public void addTeacher(Teacher t) {
        // 将数据，继续往后传递，传递给仓管。
        td.addTeacher(t);
    }

    public boolean isExists(String id) {
        // 判断。   先找【仓管】要所有的老师的数据。  老师再仓库(集合)里面
       ArrayList<Teacher> list  =  td.getAllTeacher();
       // 那个前台传给我的id,同集合中的每一个老师的id，进行逐一匹配。
        for (int i = 0; i < list.size(); i++) {
            Teacher tea = list.get(i);
            if(tea.getId().equals(id)){
                // 如果存在。则返回true
                return true;
            }
        }
        // 执行到这里，则证明传入id不存在
        return false;
    }

    public ArrayList<Teacher> findAllTeacher() {
        // 前台问我要数据，我没有！  我找仓管要。
        ArrayList<Teacher> list = td.getAllTeacher();
        return list;
    }

    public boolean deleteTeacher(String id) {
        // 业务员，在将数据传递给仓管之前，应该进行判断，这个人是否存在。
        boolean exists = isExists(id);
        // 如果存在，则将id较给仓管
        if(exists == true){
            // 则将id较给仓管
            td.deleteTeacher(id);
            return true;  // 告诉前台，已经删除成功  true
        }else {
            // 如果不存在，则告诉前台，没这个人 false
            return false;
        }
    }

    public void updateTeacher(Teacher t) {
        // 业务员无需做任何处理，继续往后传递，较给仓管
        td.updateTeacher(t);
    }
}
