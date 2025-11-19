import { Component, OnInit } from '@angular/core';
import { FishService } from './fish.service';

@Component({
  selector: 'app-fish',
  templateUrl: './fish.component.html'
})
export class FishComponent implements OnInit {
  fishList: any[] = [];
  fish = { name: '', species: '', price: 0, stockQuantity: 0 };

  constructor(private fishService: FishService) {}

  ngOnInit() { this.loadFish(); }

  loadFish() {
    this.fishService.getAll().subscribe(data => this.fishList = data);
  }

  add() {
    this.fishService.addFish(this.fish).subscribe(() => {
      this.loadFish();
      this.fish = { name: '', species: '', price: 0, stockQuantity: 0 };
    });
  }

  delete(id: number) {
    this.fishService.deleteFish(id).subscribe(() => this.loadFish());
  }
}
