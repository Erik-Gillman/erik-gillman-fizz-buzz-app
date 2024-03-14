import {HistoryState} from "./history.model";
import {HistoryActions} from "./history.actions";
import {createReducer, on} from "@ngrx/store";



export const initState: HistoryState = {
  history: []
}

export const HistoryReducer = createReducer(
  initState,
  on(HistoryActions.historyAdd, (state, props) => {
    return {
      ...state,
      history: [...state.history, props.history]
    }
  }),
  on(HistoryActions.historyDelete, (state, props) => {
  return {
    ...state,
    history: [...state.history.slice(0, props.index), ...state.history.slice(props.index + 1)]
  }
})
)
