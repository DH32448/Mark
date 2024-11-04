package com.example.controller.tea;


import com.example.dao.ClzDao;
import com.example.dao.CourseDao;
import com.example.dao.TaskDao;
import com.example.entity.Clz;
import com.example.entity.Course;
import com.example.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/tea")
public class TeaController {

    public TeaController() {
        System.out.println("MyTeaController 构造");
    }

    //修改密码
    @RequestMapping("/go2Pwd")
    public String go2Pwd(Model model) {

        return "/tea/show";  // 返回显示密码更新页面
    }
    //登分
    @PostMapping("/update")
    public String pwd(String uid,Model model, HttpSession session) {

        return "forward:/tea/update";

    }
        @Controller
        @RequestMapping("/tea")
        public class TeacherController {
            @Autowired
            ClzDao clzDao;
            @Autowired
            TaskDao taskDao;
            @Autowired
            CourseDao courseDao;
          TeacherController(){
                System.out.println("HomeController输出构造被调用");
                //  }
                //   @RequestMapping("/present")
                //  public String A(Model model  ){
                //        List<Clz> allClasses = clzDao.getAllClasses();
                //      // allClasses.forEach(System.out::println);
                //      model.addAttribute("Clz",allClasses);
                //      return "/adm/clz/present";

                //  }

            }
            @RequestMapping("/present")
            public String showDataList(Model model) {
                // 从数据库中获取任务列表
                List<Task> taskEntityList = taskDao.getAllTasks();
                model.addAttribute("taskEntityList", taskEntityList);

                // 从数据库中获取班级列表
                List<Clz> classEntityList = clzDao.getAllClasses();
                model.addAttribute("classEntityList", classEntityList);

                // 从数据库中获取课程列表
                List<Course> courseEntityList = courseDao.getAllCourses();
                model.addAttribute("courseEntityList", courseEntityList);

                return "tea/present";
            }
        }


    }