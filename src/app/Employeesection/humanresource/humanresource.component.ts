import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-humanresource',
  templateUrl: './humanresource.component.html',
  styleUrls: ['./humanresource.component.css']
})
export class HumanresourceComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
}
