import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CourseCardComponent } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [
    CommonModule,
    CourseCardComponent
  ],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseListComponent {

  selectedCourseId = 0;

  courses = [

    {
      id:1,
      name:'Angular',
      code:'ANG101',
      credits:4
    },

    {
      id:2,
      name:'Java',
      code:'JAVA101',
      credits:3
    },

    {
      id:3,
      name:'Spring Boot',
      code:'SPR101',
      credits:4
    },

    {
      id:4,
      name:'SQL',
      code:'SQL101',
      credits:2
    },

    {
      id:5,
      name:'React',
      code:'REA101',
      credits:3
    }

  ];

  onEnroll(courseId:number){

    console.log(
      'Enrolling in course: ' + courseId
    );

    this.selectedCourseId = courseId;

  }

}