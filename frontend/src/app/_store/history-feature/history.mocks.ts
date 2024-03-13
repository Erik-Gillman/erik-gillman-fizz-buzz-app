import {HistoryState} from "./history.model";

export const historyMock: {value: number; textResponse: string}[] = [
  {
    value: 3,
    textResponse: 'Fizz'
  },
  {
    value: 5,
    textResponse: 'Buzz'
  }
];

export const historyStateMock: HistoryState = {
  history: historyMock
}
