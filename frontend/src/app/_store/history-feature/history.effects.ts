import {Injectable} from "@angular/core";
import { Actions, createEffect, ofType } from '@ngrx/effects';
import {FizzbuzzService} from "../../fizzbuzz/fizzbuzz.service";
import {HistoryActions} from "./history.actions";
import {exhaustMap, map, switchMap, withLatestFrom} from "rxjs";
import {selectHistory, selectHistoryByValue} from "./history.selector";
import {select} from "@ngrx/store";

@Injectable()
export class HistoryEffects{
  constructor(private fizzbuzzService: FizzbuzzService, private actions$: Actions){}

  getResult$ = createEffect(() => this.actions$.pipe(
    ofType(HistoryActions.historyGet), switchMap((action) => {
      if(selectHistoryByValue(action.value) != null){
        map(()=>{return selectHistoryByValue(action.value)})
      }
      return this.fizzbuzzService.getResult(action.value).pipe(
        map((data)=>{
          return HistoryActions.historyAdd({history: {textResponse: data, value: action.value, id: history.length}})
        })
      )
    })
  ))
}
