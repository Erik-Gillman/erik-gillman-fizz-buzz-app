import {createFeatureSelector, createSelector} from "@ngrx/store";
import {HistoryState} from "./history.model";

const historyFeature = createFeatureSelector<HistoryState>("currHistory")
export const selectHistory = createSelector(
  historyFeature,
  (historyFeature) => {
    return historyFeature.history
  }
)

export const selectHistoryByValue = (value: number) => createSelector(
  historyFeature,
  (historyFeature) => {
    for(let i = 0; i < historyFeature.history.length; i++){
      if(value == historyFeature.history[i].value)
        return historyFeature.history[i].id
    }
    return null
  }
)
