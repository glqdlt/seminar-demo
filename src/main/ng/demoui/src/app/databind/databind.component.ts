import {Component, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-databind',
  templateUrl: './databind.component.html',
  styleUrls: ['./databind.component.css']
})
export class DatabindComponent implements OnInit {

  values ='';

  constructor() {
  }

  ngOnInit() {
  }

  onKey(event: any) {

    this.values += event.target.value + '';


  }
}
