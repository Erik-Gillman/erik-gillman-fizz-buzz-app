import {HistoryState} from "./history.model";
import {HistoryActions} from "./history.actions";
import {createReducer, on} from "@ngrx/store";



const initState: HistoryState = {
  history: []
}

export const HistoryReducer = createReducer(
  initState,
  on(HistoryActions.historyAdd, (state, props) => {
    return {
      ...state
    }
  })
)
