import { get } from '@lib/httpRequest'

export const queryCurrentTimeStamp = () => {
    return get('/api/queryCurrentTimeStamp')
}

export const queryUtcTimeStamp = () => {
    return get('/api/queryUtcTimeStamp');
}