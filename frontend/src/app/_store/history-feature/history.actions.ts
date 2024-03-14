import {createActionGroup, props} from "@ngrx/store";
import {Results} from "../../results";


export const HistoryActions = createActionGroup({
  source: "History Change",
  events:{
    "historyAdd":props<{history: { value: number; textResponse: string, id: number }}>(),
    "historyDelete":props<{index: number}>(),
    "historyGet":props<{value: number}>(),
    "historyGetById":props<{id:number}>
  }
})
