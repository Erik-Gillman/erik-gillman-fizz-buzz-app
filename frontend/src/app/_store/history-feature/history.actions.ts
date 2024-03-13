import {createActionGroup, props} from "@ngrx/store";
import {Results} from "../../results";


export const HistoryActions = createActionGroup({
  source: "History Change",
  events:{
    "historyAdd":props<{history: Results}>(),
    "historyDelete":props<{history: Results}>
  }
})
