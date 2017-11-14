import {Component, OnInit} from '@angular/core';
import {SupportService} from "../support.service";

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  message = '';

  constructor(public supportService: SupportService) {
  }

  ngOnInit() {
  }

  sendMsg(msg) {

    this.supportService.sendMsg(msg);
  }


}
