package cn.itcast.manager.D_dao;

import cn.itcast.manager.E_domain.Teacher;

import java.util.ArrayList;

// 仓管
public class TeacherDao {
    // 共享仓库，所有仓管，都使用的是同一个仓库
    static ArrayList<Teacher> list = new ArrayList<>();

    public void addTeacher(Teacher t) {
        // 将数据存入仓库(集合)。
        // 将业务员传递过来的数据，添加到集合中。
        list.add(t);
    }


    public ArrayList<Teacher> getAllTeacher() {
        // 将集合返回
        return list;
    }

    public void deleteTeacher(String id) {
        // 遍历集合，找到该id的老师，remove删除
        for (int i = 0; i < list.size(); i++) {
            Teacher tea = list.get(i);
            if (tea.getId().equals(id)) {
                list.remove(tea);
                return;
            }
        }
    }

    public void updateTeacher(Teacher t) {
        // 遍历集合，找到该id的老师，进行修改
        for (int i = 0; i < list.size(); i++) {
            Teacher tea = list.get(i);
            if (tea.getId().equals(t.getId())) {
                list.set(i,t);
                return;
            }
        }
    }
}
