import * as fromReducer from './history.reducer'
import {HistoryState} from "./history.model";
import {historyMock, historyStateMock, historyStateMock2} from "./history.mocks";
import {HistoryActions} from "./history.actions";


describe('HistoryReducer', () => {
  describe('unknown action', () => {
    it('should return default state', () => {
      const initState : HistoryState = {
        history: []
      }
      const action = {
        type: 'Unknown',
      };
      const state = fromReducer.HistoryReducer(initState, action)
      expect(state).toBe(initState)
    })
  })

  describe("addHistory action", () => {
    const initState : HistoryState = {
      history: []
    }
    const newState = {value: 3, textResponse: 'Fizz', id: 0}
    const action = HistoryActions.historyAdd({history: newState})
    const state = fromReducer.HistoryReducer(initState, action)
    expect(state).toEqual(historyStateMock2)
    expect(state).not.toBe(initState)
    })
  describe("deleteHistory action", () =>{
    const initState : HistoryState = {
      history: []
    }
    const newState = {value: 3, textResponse: 'Fizz', id: 0}
    const action = HistoryActions.historyAdd({history: newState})
    const state = fromReducer.HistoryReducer(initState, action)
    const action2 = HistoryActions.historyDelete({index: 0})
    const state2 = fromReducer.HistoryReducer(state, action2)
    expect(state2).toEqual(initState)
    expect(state2).not.toBe(historyStateMock2)
  })
})
