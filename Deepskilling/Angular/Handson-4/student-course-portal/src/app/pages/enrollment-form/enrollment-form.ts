import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-enrollment-form',
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './enrollment-form.html',
  styleUrl: './enrollment-form.css'
})
export class EnrollmentFormComponent {

  submitted = false;

  onSubmit(form: NgForm) {

    console.log(form.value);

    console.log(form.valid);

    this.submitted = true;

  }

}